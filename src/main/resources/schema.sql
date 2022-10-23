CREATE TABLE CardDetails (
    id   INTEGER  NOT NULL AUTO_INCREMENT,
    issuer VARCHAR(128) NOT NULL,
    cardNumber VARCHAR(255) NOT NULL,
    exp VARCHAR(255) NOT NULL,
    cvv   INTEGER  NOT NULL,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    zipcode VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

