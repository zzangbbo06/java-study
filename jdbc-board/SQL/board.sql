-- 게시판 프로젝트 데이터 베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board(
	no INTEGER AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    writer VARCHAR(100) NOT NULL,
    content TEXT, 
    reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 등록 작성일, default 현재 시간
    -- DATE 타입: reg_date DATE NOT NULL DEFAULT CURRENT_DATE-> 현재 날짜
    upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 수정일, 수정할때도 현재 시간을 넣겠다
    -- ON UPDATE CURRENT_TIMESTAMP: UPDATE 시 자동으로 수정 시간도 갱신
    PRIMARY KEY(no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUES 
('첫 번째 게시글입니다', '홍길동', '안녕하세요. 첫 번째 게시글의 내용입니다.'),
('두 번째 게시글', '김영희', '두 번째 게시글 내용입니다. 여기는 예시입니다.'),
('세 번째 글', '이철수', '세 번째 게시물입니다. 내용은 간단하게 작성해 보았습니다.'),
('공지사항: 서버 점검 안내', '관리자', '서버 점검이 금요일 오전 2시에 진행될 예정입니다.'),
('질문드립니다', '박민수', '이 기능은 어떻게 사용하는 건가요? 알려주세요.'),
('답변입니다', '운영자', '해당 기능은 메뉴에서 설정 후 사용할 수 있습니다.'),
('잡담글입니다', '유재석', '오늘 날씨가 정말 좋네요. 다들 좋은 하루 보내세요.'),
('버그 제보', '정형돈', '로그인 시 오류가 발생합니다. 확인 부탁드립니다.'),
('개선사항 제안', '노홍철', 'UI가 좀 더 직관적이면 좋겠습니다. 고려 부탁드려요.'),
('마지막 테스트 글', '테스터', '이 글은 테스트용으로 작성되었습니다.');

SELECT * FROM board;
SELECT * FROM board WHERE no =1;

-- 수정
UPDATE board
SET 
	title = '이젠 내가 관리자다',
	writer = '장보영',
    content = '알빠 쓰레빠 이젠 내가 관리자다.'
    -- upd_date = now() -- 수정일을 현재 시간으로 갱신 
WHERE no = 1;

-- 삭제 
DELETE FROM board
WHERE no = 1;

DROP TABLE board;