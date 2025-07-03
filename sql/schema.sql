DROP TABLE if EXISTS member CASCADE;
CREATE TABLE member (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100),
    phone VARCHAR(20)
);

INSERT INTO member (username, phone)
VALUES ('홍길동', '01012345678');