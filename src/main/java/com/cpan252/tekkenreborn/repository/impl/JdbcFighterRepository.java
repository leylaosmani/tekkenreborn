package com.cpan252.tekkenreborn.repository.impl;

import java.util.List;
import java.util.Optional;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.repository.FighterRepository;

public class JdbcFighterRepository implements FighterRepository {

  @Override
  public List<Fighter> findAll() {
    return null;
  }

  @Override
  public Optional<Fighter> findById(Long id) {
    return Optional.empty();
  }

  @Override
  public int save(Fighter fighter) {

    return 0;
  }

}
