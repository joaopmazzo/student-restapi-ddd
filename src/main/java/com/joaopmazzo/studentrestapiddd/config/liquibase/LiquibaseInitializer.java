package com.joaopmazzo.studentrestapiddd.config.liquibase;

import jakarta.annotation.PostConstruct;
import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class LiquibaseInitializer {

	private final DataSource dataSource;

	public LiquibaseInitializer(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@PostConstruct
	public void init() throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connection));
			Liquibase liquibase = new Liquibase("db/changelog/changelog-master.xml", new ClassLoaderResourceAccessor(), database);
			liquibase.update(new Contexts(), new LabelExpression());
		}
	}

}
