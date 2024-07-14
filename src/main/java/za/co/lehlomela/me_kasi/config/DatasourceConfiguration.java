package za.co.lehlomela.me_kasi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import za.co.lehlomela.me_kasi.common.Repository.BaseRepositoryJdbc;

import javax.sql.DataSource;

@Configuration
@EnableJdbcRepositories( /*activate spring SDJ repositories*/
        includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BaseRepositoryJdbc.class}),
        basePackages = {"za.co.lehlomela.me_kasi"}
//        queryLookupStrategy = QueryLookupStrategy.Key.USE_DECLARED_QUERY
)
public class DatasourceConfiguration
        extends AbstractJdbcConfiguration /*provides default beans required SDJ*/ {

    @Bean
    @ConfigurationProperties(prefix = "app.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}


