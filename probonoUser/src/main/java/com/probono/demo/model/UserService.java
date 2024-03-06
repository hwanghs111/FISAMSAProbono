package com.probono.demo.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.probono.demo.exception.MessageException;
import com.probono.demo.exception.NotExistException;
import com.probono.demo.model.dto.ActivistDTO;
import com.probono.demo.model.entity.Activist;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private ActivistDAO activistDAO;

	private ModelMapper mapper = new ModelMapper();

	public ActivistDTO getActivist(String activistId) throws Exception {
		Optional<Activist> activistEntity = activistDAO.findById(activistId);

		if (activistEntity.get() == null) {
			throw new NotExistException("검색하는 재능 기부자가 미 존재합니다.");
		}

		ActivistDTO activist = mapper.map(activistEntity.get(), ActivistDTO.class);

		return activist;
	}

	public List<ActivistDTO> getAllActivists() throws Exception {
		List<Activist> activistAll = activistDAO.findAll();

		List<ActivistDTO> activistDTOAll = Arrays.asList(mapper.map(activistAll, ActivistDTO[].class));
		return activistDTOAll;

	}

	public void notExistActivist(String activistId) throws Exception {

		boolean result = activistDAO.existsById(activistId);

		if (result != true) {
			throw new NotExistException("검색하는 재능 기부자가 미 존재합니다.");
		}

	}

	public boolean addActivist(ActivistDTO activist) throws MessageException {
		Activist activistEntity = mapper.map(activist, Activist.class); 

		try {
			Optional<Activist> act = activistDAO.findById(activist.getId());
			if (!act.isPresent()) {
				activistEntity = activistDAO.save(activistEntity); 
				return true;
			}
		} catch (Exception s) {
			throw new MessageException("이미 존재하는 ID입니다 다시 시도 하세요");
		}
		return false;
	}

	@Transactional



	public boolean deleteActivist(String activistId) throws Exception {
		notExistActivist(activistId);
		activistDAO.deleteById(activistId);
//		if(!result){
//			throw new NotExistException("재능 기부자 정보 삭제 실패");
//		}
		return true;
	}

}
