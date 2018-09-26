CREATE TABLE login
(
    username text,
    password text
)

CREATE TABLE categories
(
    category text primary key not null
)

CREATE TABLE products
(
    productid text not null,
    price decimal not null,
    stockqty INT4 not null,
    inputdate TIMESTAMP not null,
    image bytea not null,
    productname text not null,
    category text not null,
    description text not null,
    id INT4 default nextval('products_id_seq'::regclass) not null
)