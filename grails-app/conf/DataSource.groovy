dataSource {
    pooled = true
    driverClassName = "org.postgresql.Driver"
    dialect = org.hibernate.dialect.PostgreSQLDialect
    username = "postgres" 
    password = "root"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
                url = "jdbc:postgresql://localhost:5432/daniel"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/daniel"
        }
    }
    production {
       dataSource {
        dbCreate = "update"
        driverClassName = "org.postgresql.Driver"
        dialect = org.hibernate.dialect.PostgreSQLDialect   
        uri = new URI(System.getenv('OPENSHIFT_POSTGRESQL_DB_URL').toString())
		appname = System.getenv('OPENSHIFT_APP_NAME').toString()
        url = "jdbc:postgresql://"+uri.host.toString()+uri.path.toString()+"/"+appname
        username = System.getenv('OPENSHIFT_POSTGRESQL_DB_USERNAME').toString()
        password = System.getenv('OPENSHIFT_POSTGRESQL_DB_PASSWORD').toString()
    }
    }
}