package com.tweteroo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tweteroo.api.model.Msg;

public interface MsgRepository extends JpaRepository<Msg, Long> {

    @Query("SELECT m FROM Msg m WHERE m.username = ?1")
    List<Msg> findByUsername(String username);
}
