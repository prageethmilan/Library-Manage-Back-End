package lk.spring.repo;

import lk.spring.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 8:32 PM
 **/
public interface MemberRepo extends JpaRepository<Member , String> {

}
