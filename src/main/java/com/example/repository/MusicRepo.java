package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Music;

public interface MusicRepo extends JpaRepository<Music, Long>{

}
