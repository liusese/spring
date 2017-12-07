package chn.liu.htax.mapper;

import chn.liu.htax.entity.User;
import chn.liu.htax.entity.vo.UserVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IUserMapper {

	// 创建用户
    @Insert("insert into user values (UUID(), #{name}, #{password}, #{phone}, #{email}, #{address}, #{dep}, #{post}," +
            " #{account}, #{age}, #{tel}, #{type}, #{img}, #{signature})")
    int save(User user);

    // 查询所有用户
    @Select("select u.id, u.name, u.account, u.phone, u.email, u.address, d.name as dep, p.name as post, " +
    		"u.age, u.tel, ut.name as type, u.img, u.signature " +
            "from user u, user_type ut, " +
            "department d, post p " +
            "where u.type = ut.id " + 
            "and u.dep = d.id " + 
            "and u.post = p.id")
    List<UserVO> findAll();

    // 通过ID查询用户详情
    @Select("select u.id, u.name, u.account, u.phone, u.email, u.address, d.name as dep, p.name as post, " +
    		"u.age, u.tel, ut.name as type, u.img, u.signature " +
    		"from user u, user_type ut, " +
    		"department d, post p " +
    		"where u.type = ut.id " + 
    		"and u.dep = d.id " + 
    		"and u.post = p.id " +
    		"and u.id = #{0}")
    UserVO findUserById(String id);

    // 查询登录验证
    @Select("select u.id, u.name, u.account, u.phone, u.email, u.address, d.name as dep, p.name as post, " +
    		"u.age, u.tel, ut.name as type, u.img, u.signature " +
            "from user u, user_type ut, " +
            "department d, post p " +
            "where u.type = ut.id " + 
            "and u.dep = d.id " + 
            "and u.post = p.id " + 
            "and account = #{account} " +
            "and password = #{password}")
    UserVO login(User user);
    
    // 用户信息更新
    @Update("update user set name = #{name}, phone = #{phone}, type = #{type} where id = #{id}")
    int updateUser(User user);
}
