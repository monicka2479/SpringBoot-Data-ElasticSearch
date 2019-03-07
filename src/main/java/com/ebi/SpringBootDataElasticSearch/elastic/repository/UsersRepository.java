package com.ebi.SpringBootDataElasticSearch.elastic.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ebi.SpringBootDataElasticSearch.elastic.model.Users;

public interface UsersRepository extends ElasticsearchRepository<Users, Long> {
    List<Users> findByName(String text);

    List<Users> findBySalary(Long salary);
}
