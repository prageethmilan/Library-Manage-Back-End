package lk.spring.service.impl;

import lk.spring.dto.MemberDTO;
import lk.spring.entity.Member;
import lk.spring.repo.MemberRepo;
import lk.spring.service.MemberService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 8:13 PM
 **/
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepo memberRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveMember(MemberDTO dto) {
        if (!memberRepo.existsById(dto.getId())) {
            memberRepo.save(modelMapper.map(dto, Member.class));
        } else {
            throw new RuntimeException("Member already exists...");
        }
    }

    @Override
    public void updateMember(MemberDTO dto) {
        if (memberRepo.existsById(dto.getId())) {
            memberRepo.save(modelMapper.map(dto, Member.class));
        } else {
            throw new RuntimeException("No such member to update.");
        }
    }

    @Override
    public void deleteMember(String id) {
        if (memberRepo.existsById(id)) {
            memberRepo.deleteById(id);
        } else {
            throw new RuntimeException("No such member to delete...");
        }
    }

    @Override
    public MemberDTO searchMember(String id) {
        if (memberRepo.existsById(id)) {
            return modelMapper.map(memberRepo.findById(id).get(), MemberDTO.class);
        } else {
            throw new RuntimeException("No Such member");
        }
    }

    @Override
    public List<MemberDTO> getAllMembers() {
        return modelMapper.map(memberRepo.findAll(), new TypeToken<List<MemberDTO>>() {
        }.getType());
    }
}
