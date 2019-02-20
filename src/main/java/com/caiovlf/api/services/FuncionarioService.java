package com.caiovlf.api.services;

import java.util.Optional;

import com.caiovlf.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste um funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionário por Id
	 * 
	 * @param id
	 * @return Optional<Funcionario> 
	 */
	
	Optional<Funcionario> buscarPorId(Long id);
	
	/**
	 * Busca e retorna um funcionário por Cpf
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionário por E-mail
	 * 
	 * @param email
	 * @return Optional<Funcionario> 
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	
}
