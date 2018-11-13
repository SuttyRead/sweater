package com.ua.sutty.sweater.repository;

import com.ua.sutty.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

//    List<Message> findAllByTag(String tag);
}
