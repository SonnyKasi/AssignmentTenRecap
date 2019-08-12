package ac.za.cput.services;

import ac.za.cput.domain.Race;

import java.util.Set;

public interface RaceService extends InterfaceService<Race, String> {

    Set<Race> getAll();
}
