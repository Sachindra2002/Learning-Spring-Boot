package com.sachindra.rodrigo.practice.learningspring.data.repository;

import com.sachindra.rodrigo.practice.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

import javax.annotation.Resource;

@Resource
public interface RoomRepository extends CrudRepository<Room, Long> {
}
