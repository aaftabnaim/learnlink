package com.example.LearnLink.repos;

import com.example.LearnLink.models.BuyingSelling;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class BuyingSellingDetailsRepository implements JpaRepository<BuyingSelling, Long> {

    @Override
    public void flush() {

    }

    @Override
    public <S extends BuyingSelling> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<BuyingSelling> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BuyingSelling getOne(Long aLong) {
        return null;
    }

    @Override
    public BuyingSelling getById(Long aLong) {
        return null;
    }

    @Override
    public BuyingSelling getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BuyingSelling> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BuyingSelling> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends BuyingSelling, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BuyingSelling> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BuyingSelling> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<BuyingSelling> findAll() {
        return null;
    }

    @Override
    public List<BuyingSelling> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BuyingSelling entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BuyingSelling> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<BuyingSelling> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BuyingSelling> findAll(Pageable pageable) {
        return null;
    }
}
