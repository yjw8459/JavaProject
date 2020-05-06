package Ex06.Ex01Login.Data;

import java.util.List;

import Ex06.Ex01Login.Member;

public interface IMembershipManage {
	//ȸ�� ���� �� ���� ������ DB�� ����
	public boolean MembershipProc(Member member);
	//ID�� PW�� ���� ����
	public int LoginProc(String id, String pw);
	public List<Member> getMember();
}
