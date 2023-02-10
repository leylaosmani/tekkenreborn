package com.cpan252.tekkenreborn.repository;
import java.util.List;
import java.util.Optional;
import com.cpan252.tekkenreborn.model.Fighter;

public interface FighterRepository {
  List<Fighter> findAll();
  Optional<Fighter> findById(Long id);
  void save(Fighter fighter);
}
