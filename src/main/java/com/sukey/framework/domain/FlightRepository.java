package com.sukey.framework;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

public interface FlightRepository extends CrudRepository<Flight, Long> {

	@Override
	@PreAuthorize("#oauth2.hasScope('read')")
	Iterable<Flight> findAll();

	@Override
	@PreAuthorize("#oauth2.hasScope('read')")
	Flight findOne(Long aLong);

	@Override
	@PreAuthorize("#oauth2.hasScope('write')")
	<S extends Flight> S save(S entity);

}
