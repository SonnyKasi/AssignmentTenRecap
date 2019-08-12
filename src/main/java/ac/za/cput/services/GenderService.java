package ac.za.cput.services;

import ac.za.cput.domain.Gender;

import java.util.Set;

public interface GenderService extends InterfaceService<Gender, String> {

    Set<Gender> getAll();
}
