package cn.com.sinosoft;

import java.util.Map;

import javax.sql.DataSource;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootApplication
@EnableAutoConfiguration//(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
//		JdbcTemplate jt = new JdbcTemplate();
//		DruidDataSource ds = new DruidDataSource();
//		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
//		ds.setUsername("scott");
//		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		ds.setPassword("tiger");
//		jt.setDataSource(ds);
//		String sql = "select * from emp where empno='7787'";
//		Map<String, Object> map = jt.queryForMap(sql );
//		System.out.println(map);
	}

}
