package chn.liu.htax.mapper;

import chn.liu.htax.entity.UserType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IUserTypeMapper {

	// 获取所有用户类型
	@Select("SELECT id as utId, name as utName, notes from user_type")
	List<UserType> findAll();
}
