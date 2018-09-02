package br.com.passeio_pago.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.passeio_pago.common.service.EntityCrudService;
import br.com.passeio_pago.role.dao.RoleDao;
import br.com.passeio_pago.role.domain.RolePublic;
import br.com.passeio_pago.role.domain.dto.RoleDto;
import br.com.passeio_pago.role.domain.dto.RoleRegistrationDto;
import br.com.passeio_pago.role.domain.dto.RoleRegistrationResponseDto;
import br.com.passeio_pago.role.domain.entity.RoleEntity;

@Service
public class RoleService extends EntityCrudService<RoleEntity, Long, RoleDto, RoleRegistrationDto, RoleRegistrationResponseDto> {

	@Autowired
	private RoleDao dao;
	
	@Override
	public RoleRegistrationResponseDto convertPublicDtoToRegistrationResponseDto(RoleDto publicDto) {
		RoleRegistrationResponseDto responseDto = new RoleRegistrationResponseDto(publicDto);
		return responseDto;
	}

	@Override
	public RoleEntity convertRegistrationDtoToEntityDao(RoleRegistrationDto registrationDto) {
		RoleEntity entity = new RoleEntity(registrationDto.getName());
		return entity;
	}

	@Override
	public void validateRegistrationDto(RoleRegistrationDto registrationDto) {
	}

	@Override
	public RoleDto convertEntityDaoToPublicDto(RoleEntity entity) {
		RoleDto publicDto = new RoleDto((RolePublic) entity);
		return publicDto;
	}

	@Override
	public JpaRepository<RoleEntity, Long> getDao() {
		return dao;
	}

}
