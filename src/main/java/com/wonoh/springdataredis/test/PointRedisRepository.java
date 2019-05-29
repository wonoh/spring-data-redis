package com.wonoh.springdataredis.test;

import org.springframework.data.repository.CrudRepository;

public interface PointRedisRepository extends CrudRepository<Point,String> {
}
