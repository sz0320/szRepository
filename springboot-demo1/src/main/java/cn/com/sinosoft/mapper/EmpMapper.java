package cn.com.sinosoft.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.com.sinosoft.po.Emp;
@Mapper
public interface EmpMapper {

	@Select("select * from emp where empno = #{empNo}")
	Emp findEmp(@Param("empNo") Integer empNo);
}
