/**
 */
package br.unb.cic.c2system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.unb.cic.c2system.C2systemPackage#getRoleType()
 * @model
 * @generated
 */
public enum RoleType implements Enumerator {
	/**
	 * The '<em><b>C2 APPROACH MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C2_APPROACH_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	C2_APPROACH_MANAGER(0, "C2_APPROACH_MANAGER", "C2_APPROACH_MANAGER"),

	/**
	 * The '<em><b>TASK ALLOCATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_ALLOCATOR_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_ALLOCATOR(1, "TASK_ALLOCATOR", "TASK_ALLOCATOR"),

	/**
	 * The '<em><b>TASK PERFORMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_PERFORMER_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_PERFORMER(2, "TASK_PERFORMER", "TASK_PERFORMER");

	/**
	 * The '<em><b>C2 APPROACH MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C2_APPROACH_MANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C2_APPROACH_MANAGER_VALUE = 0;

	/**
	 * The '<em><b>TASK ALLOCATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_ALLOCATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ALLOCATOR_VALUE = 1;

	/**
	 * The '<em><b>TASK PERFORMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_PERFORMER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_PERFORMER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoleType[] VALUES_ARRAY = new RoleType[] { C2_APPROACH_MANAGER, TASK_ALLOCATOR,
			TASK_PERFORMER, };

	/**
	 * A public read-only list of all the '<em><b>Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType get(int value) {
		switch (value) {
		case C2_APPROACH_MANAGER_VALUE:
			return C2_APPROACH_MANAGER;
		case TASK_ALLOCATOR_VALUE:
			return TASK_ALLOCATOR;
		case TASK_PERFORMER_VALUE:
			return TASK_PERFORMER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RoleType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RoleType
