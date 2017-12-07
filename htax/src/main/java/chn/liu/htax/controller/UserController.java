package chn.liu.htax.controller;

import chn.liu.htax.entity.User;
import chn.liu.htax.entity.UserType;
import chn.liu.htax.mapper.IUserMapper;
import chn.liu.htax.mapper.IUserTypeMapper;
import chn.liu.htax.util.EncodeUtil;
import chn.liu.htax.entity.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.util.List;

@RestController
@Api(value = "user")
@RequestMapping(value = "/1.0")
public class UserController {
	@Autowired
	private IUserMapper userDao;
	@Autowired
	private IUserTypeMapper userTypeDao;

	// - - - - - - - user - - - - - - -
	@ApiOperation(value = "注册用户", nickname = "registerUser", response = User.class)
	@RequestMapping(value = "/user/register", method = RequestMethod.POST, produces = { "application/json" })
	public ResponseEntity<?> registerUser(@ApiParam(value = "用户实体") @RequestBody User registerUser) throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		String password = registerUser.getPassword();
		registerUser.setPassword(EncodeUtil.string2MD5(password + "the salt"));
		int flag = userDao.save(registerUser);
		if (0 == flag) {
			msg.add("Status-Message", URLEncoder.encode("注册失败！", "UTF-8"));
			return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
		} else {
			msg.add("Status-Message", URLEncoder.encode("注册成功！", "UTF-8"));
			return new ResponseEntity<User>(registerUser, msg, HttpStatus.OK);
		}
	}

	@ApiOperation(value = "获取用户详情(用于登录)", nickname = "getLoginUser", response = UserVO.class)
	@RequestMapping(value = "/user/login", method = RequestMethod.POST, produces = { "application/json" })
	public ResponseEntity<?> getLoginUser(@ApiParam(value = "用户实体") @RequestBody User loginUser) throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		String password = loginUser.getPassword();
		loginUser.setPassword(EncodeUtil.string2MD5(password + "the salt"));
		UserVO user = userDao.login(loginUser);
		if (null == user || user.toString().equals("")) {
			msg.add("Status-Message", URLEncoder.encode("用户不存在！", "UTF-8"));
			return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
		} else {
			msg.add("Status-Message", URLEncoder.encode("登录成功！", "UTF-8"));
			return new ResponseEntity<UserVO>(user, msg, HttpStatus.OK);
		}
	}

	@ApiOperation(value = "获取用户列表", nickname = "getAllUsers", response = UserVO.class, responseContainer = "List")
	@RequestMapping(value = "/user/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<UserVO>> getAllUsers() throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		msg.add("Status-Message", URLEncoder.encode("查询成功！", "UTF-8"));
		return new ResponseEntity<List<UserVO>>(userDao.findAll(), msg, HttpStatus.OK);
	}

	@ApiOperation(value = "通过ID获取用户详情", nickname = "findUserById", response = UserVO.class)
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> findUserById(@ApiParam(value = "用户ID") @PathVariable(required = true) String id) throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		UserVO user = userDao.findUserById(id);
		if (null == user || user.toString().equals("")) {
			msg.add("Status-Message", URLEncoder.encode("用户不存在！", "UTF-8"));
			return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
		}
		msg.add("Status-Message", URLEncoder.encode("查询成功！", "UTF-8"));
		return new ResponseEntity<UserVO>(user, msg, HttpStatus.OK);
	}

	@ApiOperation(value = "更新用户", nickname = "updateUser")
	@RequestMapping(value = "/user/update", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<?> updateUser(@ApiParam(value = "用户ID") @RequestBody User user) throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		int flag = userDao.updateUser(user);
		if (1 == flag) {
			msg.add("Status-Message", URLEncoder.encode("更新成功！", "UTF-8"));
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} else {
			msg.add("Status-Message", URLEncoder.encode("更新失败！", "UTF-8"));
			return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
		}
	}
	// - - - - - - - end user - - - - - - -

	// - - - - - - - user type - - - - - - -
	@ApiOperation(value = "获取用户类型列表", nickname = "getAllUserType", response = UserType.class, responseContainer = "List")
	@RequestMapping(value = "/usertype/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<UserType>> getAllUserType() throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		msg.add("Status-Message", URLEncoder.encode("查询成功！", "UTF-8"));
		return new ResponseEntity<List<UserType>>(userTypeDao.findAll(), msg, HttpStatus.OK);
	}

}
