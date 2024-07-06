package miu.edu.deliverysystem.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum Role {
    ADMIN(
            Set.of(
                    Permission.ADMIN_WRITE,
                    Permission.ADMIN_READ
            )
    ),
    MEMBER (
            Set.of(
                    Permission.MEMBER_WRITE,
                    Permission.MEMBER_READ
            )
    );
    private final Set<Permission> permissions;

}