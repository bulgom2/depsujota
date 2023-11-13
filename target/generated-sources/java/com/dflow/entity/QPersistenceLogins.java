package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPersistenceLogins is a Querydsl query type for PersistenceLogins
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPersistenceLogins extends EntityPathBase<PersistenceLogins> {

    private static final long serialVersionUID = -1136220889L;

    public static final QPersistenceLogins persistenceLogins = new QPersistenceLogins("persistenceLogins");

    public final DateTimePath<java.sql.Timestamp> lastUsed = createDateTime("lastUsed", java.sql.Timestamp.class);

    public final StringPath memberId = createString("memberId");

    public final StringPath series = createString("series");

    public final StringPath token = createString("token");

    public QPersistenceLogins(String variable) {
        super(PersistenceLogins.class, forVariable(variable));
    }

    public QPersistenceLogins(Path<? extends PersistenceLogins> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersistenceLogins(PathMetadata metadata) {
        super(PersistenceLogins.class, metadata);
    }

}

