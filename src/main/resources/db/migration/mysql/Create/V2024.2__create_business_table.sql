CREATE TABLE BUSINESS
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(150) NOT NULL,
    phone_number VARCHAR(20),
    email        VARCHAR(100) NOT NULL UNIQUE,
    website      VARCHAR(200) UNIQUE,
    description  TEXT,
    profile_img_url  VARCHAR(200)
);