package chn.liu.htax.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import chn.liu.htax.entity.vo.ClientVO;
import chn.liu.htax.entity.vo.FanVO;
import chn.liu.htax.entity.vo.ProjectDetailVO;
import chn.liu.htax.entity.vo.ProjectSchemeVO;
import chn.liu.htax.entity.vo.ProjectVO;
import chn.liu.htax.entity.vo.UserVO;
import chn.liu.htax.mapper.IFileMapper;

@RestController
@Api(value = "file")
@RequestMapping(value = "/1.0")
public class FileController {
	@Autowired
	IFileMapper fileDao;

	@ApiOperation(value = "获取所有项目", nickname = "getAllProjects", response = ProjectVO.class, responseContainer = "List")
	@RequestMapping(value = "/project/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<ProjectVO>> getAllProjects() throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		msg.add("Status-Message", URLEncoder.encode("查询成功！", "UTF-8"));
		return new ResponseEntity<List<ProjectVO>>(fileDao.getAllProjects(), msg, HttpStatus.OK);
	}

	@ApiOperation(value = "获取项目详情（通过项目id）", nickname = "getProjectById", response = ProjectDetailVO.class)
	@RequestMapping(value = "/project/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getProjectById(@ApiParam(value = "项目id") @PathVariable(required = true) String id) throws Exception {
		MultiValueMap<String, String> msg = new HttpHeaders();
		ProjectDetailVO pd = fileDao.getProjectById(id);
		if (null == pd || pd.toString().equals("")) {
			msg.add("Status-Message", URLEncoder.encode("项目不存在！", "UTF-8"));
			return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
		}
		// 获取用户详情
		ClientVO client = fileDao.getClientInfoByPid(id);
		pd.setClient(client);
		// 获取负责人详情
		UserVO pic = fileDao.getPICInfoByPid(id);
		pd.setPic(pic);
		// 获取设计者详情
		UserVO designer = fileDao.getDesignerInfoByPid(id);
		pd.setDesigner(designer);
		// 获取风机详情
		FanVO fan = fileDao.getFanInfoByPid(id);
		pd.setFan(fan);
		// 获取项目方案详情
		List<List<ProjectSchemeVO>> psList = new ArrayList<List<ProjectSchemeVO>>();
		List <String> psIds = fileDao.getAllSchemeId(id);
		for (String psId: psIds) {
			psList.add(fileDao.getSchemeInfoByPsId(psId));
		}
		pd.setScheme(psList);
		msg.add("Status-Message", URLEncoder.encode("项目详情查询成功！", "UTF-8"));
		return new ResponseEntity<ProjectDetailVO>(pd, msg, HttpStatus.OK);
	}
}
















