CREATE TABLE board (
    board_num INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    content TEXT NULL,
    writer VARCHAR(100) NOT NULL,
    wr_date TIMESTAMP DEFAULT NOW(),
    view_cnt INT DEFAULT 0
);
