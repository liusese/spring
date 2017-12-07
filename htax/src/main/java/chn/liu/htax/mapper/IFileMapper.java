package chn.liu.htax.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import chn.liu.htax.entity.vo.ClientVO;
import chn.liu.htax.entity.vo.FanVO;
import chn.liu.htax.entity.vo.ProjectDetailVO;
import chn.liu.htax.entity.vo.ProjectSchemeVO;
import chn.liu.htax.entity.vo.ProjectVO;
import chn.liu.htax.entity.vo.UserVO;

@Mapper
@Repository
public interface IFileMapper {
	
	// 获取全部项目详情
	@Select("SELECT p.id, p. NAME, c. NAME AS client, count, background, nodus, dt.NAME AS devType, f.NAME AS fan, importance, mainFactory, " +
			"ps.NAME AS STATUS, createTime, pp.name as progress, planDelivery, actualDelivery, p.notes " + 
			"FROM project p, client c, dev_type dt, fan f, project_status ps, project_progress pp " + 
			"WHERE p.client = c.id AND p.type = dt.id AND p.fan = f.id AND p.STATUS = ps.id AND p.progress = pp.id")
	List<ProjectVO> getAllProjects();
	
	// 通过Id获取单个项目详情   ----  start
	@Select("SELECT id, NAME from project where id = #{0}")
	ProjectDetailVO getProjectById(String id);
	// 获取客户详情
	@Select("SELECT c.name, c.contact, c.phone, c.tel, c.email, c.address from client c, project p WHERE c.id = p.client and p.id = #{0}")
	ClientVO getClientInfoByPid(String id);
	// 获取负责人详情
	@Select("SELECT u.name, u.tel, u.phone, u.email, ut.name as type, p.name as post, d.name as dep, u.img " +
			"from user u, project pj, user_type ut, department d, post p " + 
			"WHERE u.id = pj.pic AND u.type = ut.id AND u.post = p.id AND u.dep = d.id and pj.id = #{0}")
	UserVO getPICInfoByPid(String id);
	// 获取设计者详情
	@Select("SELECT u.name, u.tel, u.phone, u.email, ut.name as type, p.name as post, d.name as dep, u.img " +
			"from user u, project pj, user_type ut, department d, post p " + 
			"WHERE u.id = pj.designer AND u.type = ut.id AND u.post = p.id AND u.dep = d.id and pj.id = #{0}")
	UserVO getDesignerInfoByPid(String id);
	// 获取风机详情
	@Select("SELECT f.name, ft.name as feature, f.air_volume as airVolume, f.static_press as staticPress, f.noise, f.power " +
			"FROM fan f, project p, feature ft " + 
			"where f.id = p.fan and f.feature = ft.id and p.id = #{0}")
	FanVO getFanInfoByPid(String id);
	// 获取方案ID
	@Select("Select ps.id FROM project_scheme ps, project p WHERE ps.pid = p.id and p.id = #{0}")
	List<String> getAllSchemeId(String id);
	// 获取项目方案详情
	@Select("SELECT ps.id, ps.active, sn.name, sn.plan, sn.actual, sn.notes " +
			"from project_scheme ps, scheme_node sn " + 
			"where ps.id = sn.psid and ps.id = #{0}")
	List<ProjectSchemeVO> getSchemeInfoByPsId(String psId);
	// 通过Id获取单个项目详情   ----  end
}
