package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCodeInfo is a Querydsl query type for CodeInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCodeInfo extends EntityPathBase<CodeInfo> {

    private static final long serialVersionUID = -2116020483L;

    public static final QCodeInfo codeInfo = new QCodeInfo("codeInfo");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath codeAccount = createString("codeAccount");

    public final BooleanPath codeFlag = createBoolean("codeFlag");

    public final StringPath codeName = createString("codeName");

    public final NumberPath<Long> codeNo = createNumber("codeNo", Long.class);

    public final StringPath codeType = createString("codeType");

    public final StringPath codeValue = createString("codeValue");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    public final NumberPath<Long> createNo = createNumber("createNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public final NumberPath<Long> updateNo = createNumber("updateNo", Long.class);

    public QCodeInfo(String variable) {
        super(CodeInfo.class, forVariable(variable));
    }

    public QCodeInfo(Path<? extends CodeInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeInfo(PathMetadata metadata) {
        super(CodeInfo.class, metadata);
    }

}

