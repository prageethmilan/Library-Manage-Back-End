package lk.spring.service;

import lk.spring.dto.MemberDTO;

import java.util.List;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 8:06 PM
 **/
public interface MemberService {
    void saveMember(MemberDTO dto);
    void updateMember(MemberDTO dto);
    void deleteMember(String id);
    MemberDTO searchMember(String id);
    List<MemberDTO> getAllMembers();
}
