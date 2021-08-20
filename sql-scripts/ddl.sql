create table orders
(
    id          bigint unsigned auto_increment primary key comment '主键',
    customer_id bigint unsigned not null comment '买家ID',
    product_id  bigint unsigned not null comment '商品ID',
    amount      bigint unsigned not null comment '数量'
) comment '订单表';

create
index idx_order_cid
    on orders (customer_id);

create
index idx_order_pid
    on orders (product_id);

create table products
(
    id      bigint unsigned auto_increment primary key comment '主键',
    name    varchar(100) not null comment '名称',
    stock   bigint unsigned not null comment '库存',
    version bigint unsigned not null default 0 comment '乐观锁版本'
) comment '商品表';

create
index idx_products_name
    on products (name);