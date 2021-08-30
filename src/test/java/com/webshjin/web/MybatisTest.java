package com.webshjin.web;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(  // root-context.xml ������ �Բ� �����Ͽ� �׽�Ʈ �ض�
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)
public class MybatisTest {
	@Inject
	private SqlSessionFactory sf;
	
	@Test
	public void testFactory() {
		if(sf != null) {
			System.out.println("SF : "+ sf);
		}
		
	}

}
