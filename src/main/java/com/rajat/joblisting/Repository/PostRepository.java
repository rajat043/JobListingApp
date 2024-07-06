package com.rajat.joblisting.Repository;

import com.rajat.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
    //Mongo reository takes care of all CRUD operations


}
