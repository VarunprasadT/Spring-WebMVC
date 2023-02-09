package com.xworkz.snake.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.snake.snakeDTO.SnakeDTO;
@Repository
public class RepoIMPL implements Repo {
	public RepoIMPL() {
		System.out.println("Creating...RepoIMPL");
	}

	@Override
	public boolean save(SnakeDTO dto) {
		System.out.println("Running...save");
		return true;
	}

}
