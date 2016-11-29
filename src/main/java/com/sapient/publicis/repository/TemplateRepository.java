package com.sapient.publicis.repository;

import com.sapient.publicis.model.Template;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TemplateRepository extends MongoRepository<Template, String>{
    Template findByTemplateCode(String templateCode);
}
