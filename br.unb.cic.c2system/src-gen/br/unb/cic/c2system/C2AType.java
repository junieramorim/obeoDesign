/**
 */
package br.unb.cic.c2system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>C2A Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.unb.cic.c2system.C2systemPackage#getC2AType()
 * @model
 * @generated
 */
public enum C2AType implements Enumerator {
	/**
	 * The '<em><b>CONFLICTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICTED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICTED(0, "CONFLICTED", "CONFLICTED"),

	/**
	 * The '<em><b>DECONFLICTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECONFLICTED_VALUE
	 * @generated
	 * @ordered
	 */
	DECONFLICTED(1, "DECONFLICTED", "DECONFLICTED"),

	/**
	 * The '<em><b>COORDINATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COORDINATED_VALUE
	 * @generated
	 * @ordered
	 */
	COORDINATED(2, "COORDINATED", "COORDINATED"),

	/**
	 * The '<em><b>COLLABORATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATIVE(3, "COLLABORATIVE", "COLLABORATIVE"),

	/**
	 * The '<em><b>EDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE_VALUE
	 * @generated
	 * @ordered
	 */
	EDGE(4, "EDGE", "EDGE");

	/**
	 * The '<em><b>CONFLICTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICTED_VALUE = 0;

	/**
	 * The '<em><b>DECONFLICTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECONFLICTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECONFLICTED_VALUE = 1;

	/**
	 * The '<em><b>COORDINATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COORDINATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATED_VALUE = 2;

	/**
	 * The '<em><b>COLLABORATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATIVE_VALUE = 3;

	/**
	 * The '<em><b>EDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>C2A Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final C2AType[] VALUES_ARRAY = new C2AType[] { CONFLICTED, DECONFLICTED, COORDINATED, COLLABORATIVE,
			EDGE, };

	/**
	 * A public read-only list of all the '<em><b>C2A Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<C2AType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>C2A Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static C2AType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			C2AType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>C2A Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static C2AType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			C2AType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>C2A Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static C2AType get(int value) {
		switch (value) {
		case CONFLICTED_VALUE:
			return CONFLICTED;
		case DECONFLICTED_VALUE:
			return DECONFLICTED;
		case COORDINATED_VALUE:
			return COORDINATED;
		case COLLABORATIVE_VALUE:
			return COLLABORATIVE;
		case EDGE_VALUE:
			return EDGE;
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
	private C2AType(int value, String name, String literal) {
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

} //C2AType
