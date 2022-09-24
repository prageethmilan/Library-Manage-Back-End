package lk.spring.controller;

import lk.spring.dto.MemberDTO;
import lk.spring.service.MemberService;
import lk.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 7:51 PM
 **/
@RestController
@CrossOrigin
@RequestMapping("api/v1/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllMembers() {
        return new ResponseUtil(200, "Ok", memberService.getAllMembers());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveMember(@ModelAttribute MemberDTO dto) {
        System.out.println(dto.getId());
        memberService.saveMember(dto);
        return new ResponseUtil(200, "Saved Successfully", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateMember(@RequestBody MemberDTO dto) {
        memberService.updateMember(dto);
        return new ResponseUtil(200, "Updated", null);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteMember(@RequestParam String id) {
        memberService.deleteMember(id);
        return new ResponseUtil(200, "deleted", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchMember(@PathVariable String id) {
        return new ResponseUtil(200, "Ok", memberService.searchMember(id));
    }
}
