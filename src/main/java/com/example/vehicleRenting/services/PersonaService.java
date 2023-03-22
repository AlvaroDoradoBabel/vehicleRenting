package com.example.vehicleRenting.services;

import com.example.vehicleRenting.exceptions.RequiredMissingFieldException;
import com.example.vehicleRenting.models.Persona;

public interface PersonaService {
    Persona addPersona(Persona persona) throws RequiredMissingFieldException;
}
