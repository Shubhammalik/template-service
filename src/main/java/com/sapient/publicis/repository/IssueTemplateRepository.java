package com.sapient.publicis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sapient.publicis.model.IssueTemplate;

public interface IssueTemplateRepository extends MongoRepository<IssueTemplate, String>{

    @Query(value = "{ 'applicationName' : ?0, 'issueType' : ?1 }", fields = "{ 'templateCode' : 1 }")
    String getTemplateCode(String applicationName, String issueType);
}
