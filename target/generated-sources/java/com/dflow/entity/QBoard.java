package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -529668252L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("board");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath boardContent = createString("boardContent");

    public final BooleanPath boardFlag = createBoolean("boardFlag");

    public final NumberPath<Long> boardNo = createNumber("boardNo", Long.class);

    public final StringPath boardNotice = createString("boardNotice");

    public final DatePath<java.time.LocalDate> boardNotiDateEnd = createDate("boardNotiDateEnd", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> boardNotiDateStart = createDate("boardNotiDateStart", java.time.LocalDate.class);

    public final StringPath boardTitle = createString("boardTitle");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    public final QMemberInfo createInfo;

    public final NumberPath<Long> createNo = createNumber("createNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public final QMemberInfo updateInfo;

    public final NumberPath<Long> updateNo = createNumber("updateNo", Long.class);

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.createInfo = inits.isInitialized("createInfo") ? new QMemberInfo(forProperty("createInfo"), inits.get("createInfo")) : null;
        this.updateInfo = inits.isInitialized("updateInfo") ? new QMemberInfo(forProperty("updateInfo"), inits.get("updateInfo")) : null;
    }

}

