/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.unb.cic.c2system.C2systemFactory
 * @model kind="package"
 * @generated
 */
public interface C2systemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "c2system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/c2system";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "c2system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C2systemPackage eINSTANCE = br.unb.cic.c2system.impl.C2systemPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.AllocableImpl <em>Allocable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.AllocableImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAllocable()
	 * @generated
	 */
	int ALLOCABLE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Allocable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allocable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.MissionImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ID = ALLOCABLE__ID;

	/**
	 * The feature id for the '<em><b>Completeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__COMPLETENESS = ALLOCABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TASKS = ALLOCABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = ALLOCABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = ALLOCABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.NamedClassImpl <em>Named Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.NamedClassImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getNamedClass()
	 * @generated
	 */
	int NAMED_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.EntityImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Roleassignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ROLEASSIGNMENT = NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Poc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POC = NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LEADER = NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.AgentImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Roleassignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ROLEASSIGNMENT = ENTITY__ROLEASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Poc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__POC = ENTITY__POC;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LEADER = ENTITY__LEADER;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.TeamImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Roleassignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ROLEASSIGNMENT = ENTITY__ROLEASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Poc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__POC = ENTITY__POC;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LEADER = ENTITY__LEADER;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MEMBERS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__OPERATES = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.TaskImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = ALLOCABLE__ID;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPLETED = ALLOCABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COST = ALLOCABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__XPOS = ALLOCABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__YPOS = ALLOCABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ALLOCABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ALLOCABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.C2ApproachImpl <em>C2 Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.C2ApproachImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getC2Approach()
	 * @generated
	 */
	int C2_APPROACH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH__NAME = NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH__TYPE = NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH__ROLES = NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH__APPLIES = NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH__CONNECTIONS = NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C2 Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH_FEATURE_COUNT = NAMED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C2 Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_APPROACH_OPERATION_COUNT = NAMED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.EnvironmentImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Sensor Degradation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SENSOR_DEGRADATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.C2SystemImpl <em>C2 System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.C2SystemImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getC2System()
	 * @generated
	 */
	int C2_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM__MISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM__ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Approaches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM__APPROACHES = 3;

	/**
	 * The feature id for the '<em><b>Allocation Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM__ALLOCATION_SET = 4;

	/**
	 * The number of structural features of the '<em>C2 System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>C2 System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.RoleImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TYPE = NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY = NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.AllocationImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 11;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.ConnectionImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SRC = 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TGT = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.AllocationSetImpl <em>Allocation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.AllocationSetImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAllocationSet()
	 * @generated
	 */
	int ALLOCATION_SET = 13;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_SET__ALLOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Allocation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allocation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.IntraImpl <em>Intra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.IntraImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getIntra()
	 * @generated
	 */
	int INTRA = 14;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA__SRC = CONNECTION__SRC;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA__TGT = CONNECTION__TGT;

	/**
	 * The number of structural features of the '<em>Intra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.impl.InterImpl <em>Inter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.impl.InterImpl
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getInter()
	 * @generated
	 */
	int INTER = 15;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER__SRC = CONNECTION__SRC;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER__TGT = CONNECTION__TGT;

	/**
	 * The number of structural features of the '<em>Inter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.RoleType
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 16;

	/**
	 * The meta object id for the '{@link br.unb.cic.c2system.C2AType <em>C2A Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unb.cic.c2system.C2AType
	 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getC2AType()
	 * @generated
	 */
	int C2A_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see br.unb.cic.c2system.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Mission#getCompleteness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completeness</em>'.
	 * @see br.unb.cic.c2system.Mission#getCompleteness()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Completeness();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.Mission#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see br.unb.cic.c2system.Mission#getTasks()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Tasks();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see br.unb.cic.c2system.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see br.unb.cic.c2system.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.Team#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see br.unb.cic.c2system.Team#getMembers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Members();

	/**
	 * Returns the meta object for the reference '{@link br.unb.cic.c2system.Team#getOperates <em>Operates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operates</em>'.
	 * @see br.unb.cic.c2system.Team#getOperates()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Operates();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see br.unb.cic.c2system.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Task#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see br.unb.cic.c2system.Task#isCompleted()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Completed();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Task#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see br.unb.cic.c2system.Task#getCost()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Cost();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Task#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see br.unb.cic.c2system.Task#getXPos()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_XPos();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Task#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see br.unb.cic.c2system.Task#getYPos()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_YPos();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.C2Approach <em>C2 Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2 Approach</em>'.
	 * @see br.unb.cic.c2system.C2Approach
	 * @generated
	 */
	EClass getC2Approach();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.C2Approach#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.unb.cic.c2system.C2Approach#getType()
	 * @see #getC2Approach()
	 * @generated
	 */
	EAttribute getC2Approach_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.C2Approach#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see br.unb.cic.c2system.C2Approach#getRoles()
	 * @see #getC2Approach()
	 * @generated
	 */
	EReference getC2Approach_Roles();

	/**
	 * Returns the meta object for the reference '{@link br.unb.cic.c2system.C2Approach#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies</em>'.
	 * @see br.unb.cic.c2system.C2Approach#getApplies()
	 * @see #getC2Approach()
	 * @generated
	 */
	EReference getC2Approach_Applies();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.C2Approach#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see br.unb.cic.c2system.C2Approach#getConnections()
	 * @see #getC2Approach()
	 * @generated
	 */
	EReference getC2Approach_Connections();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see br.unb.cic.c2system.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Environment#getSensorDegradation <em>Sensor Degradation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Degradation</em>'.
	 * @see br.unb.cic.c2system.Environment#getSensorDegradation()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_SensorDegradation();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Environment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.unb.cic.c2system.Environment#getDescription()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Description();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.C2System <em>C2 System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2 System</em>'.
	 * @see br.unb.cic.c2system.C2System
	 * @generated
	 */
	EClass getC2System();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.C2System#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see br.unb.cic.c2system.C2System#getEntities()
	 * @see #getC2System()
	 * @generated
	 */
	EReference getC2System_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.C2System#getMissions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missions</em>'.
	 * @see br.unb.cic.c2system.C2System#getMissions()
	 * @see #getC2System()
	 * @generated
	 */
	EReference getC2System_Missions();

	/**
	 * Returns the meta object for the containment reference '{@link br.unb.cic.c2system.C2System#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see br.unb.cic.c2system.C2System#getEnvironment()
	 * @see #getC2System()
	 * @generated
	 */
	EReference getC2System_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.C2System#getApproaches <em>Approaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approaches</em>'.
	 * @see br.unb.cic.c2system.C2System#getApproaches()
	 * @see #getC2System()
	 * @generated
	 */
	EReference getC2System_Approaches();

	/**
	 * Returns the meta object for the containment reference '{@link br.unb.cic.c2system.C2System#getAllocationSet <em>Allocation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation Set</em>'.
	 * @see br.unb.cic.c2system.C2System#getAllocationSet()
	 * @see #getC2System()
	 * @generated
	 */
	EReference getC2System_AllocationSet();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see br.unb.cic.c2system.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference list '{@link br.unb.cic.c2system.Entity#getRoleassignment <em>Roleassignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roleassignment</em>'.
	 * @see br.unb.cic.c2system.Entity#getRoleassignment()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Roleassignment();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Entity#isPoc <em>Poc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poc</em>'.
	 * @see br.unb.cic.c2system.Entity#isPoc()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Poc();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Entity#isLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader</em>'.
	 * @see br.unb.cic.c2system.Entity#isLeader()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Leader();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see br.unb.cic.c2system.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.unb.cic.c2system.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Type();

	/**
	 * Returns the meta object for the reference list '{@link br.unb.cic.c2system.Role#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity</em>'.
	 * @see br.unb.cic.c2system.Role#getEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Entity();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.NamedClass <em>Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Class</em>'.
	 * @see br.unb.cic.c2system.NamedClass
	 * @generated
	 */
	EClass getNamedClass();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.NamedClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.unb.cic.c2system.NamedClass#getName()
	 * @see #getNamedClass()
	 * @generated
	 */
	EAttribute getNamedClass_Name();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Allocable <em>Allocable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocable</em>'.
	 * @see br.unb.cic.c2system.Allocable
	 * @generated
	 */
	EClass getAllocable();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Allocable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see br.unb.cic.c2system.Allocable#getId()
	 * @see #getAllocable()
	 * @generated
	 */
	EAttribute getAllocable_Id();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see br.unb.cic.c2system.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the reference '{@link br.unb.cic.c2system.Allocation#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler</em>'.
	 * @see br.unb.cic.c2system.Allocation#getHandler()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Handler();

	/**
	 * Returns the meta object for the reference '{@link br.unb.cic.c2system.Allocation#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignment</em>'.
	 * @see br.unb.cic.c2system.Allocation#getAssignment()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Allocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see br.unb.cic.c2system.Allocation#getId()
	 * @see #getAllocation()
	 * @generated
	 */
	EAttribute getAllocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.Allocation#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see br.unb.cic.c2system.Allocation#getTimestamp()
	 * @see #getAllocation()
	 * @generated
	 */
	EAttribute getAllocation_Timestamp();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see br.unb.cic.c2system.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link br.unb.cic.c2system.Connection#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see br.unb.cic.c2system.Connection#getSrc()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Src();

	/**
	 * Returns the meta object for the reference '{@link br.unb.cic.c2system.Connection#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see br.unb.cic.c2system.Connection#getTgt()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Tgt();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.AllocationSet <em>Allocation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Set</em>'.
	 * @see br.unb.cic.c2system.AllocationSet
	 * @generated
	 */
	EClass getAllocationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unb.cic.c2system.AllocationSet#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocations</em>'.
	 * @see br.unb.cic.c2system.AllocationSet#getAllocations()
	 * @see #getAllocationSet()
	 * @generated
	 */
	EReference getAllocationSet_Allocations();

	/**
	 * Returns the meta object for the attribute '{@link br.unb.cic.c2system.AllocationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.unb.cic.c2system.AllocationSet#getName()
	 * @see #getAllocationSet()
	 * @generated
	 */
	EAttribute getAllocationSet_Name();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Intra <em>Intra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intra</em>'.
	 * @see br.unb.cic.c2system.Intra
	 * @generated
	 */
	EClass getIntra();

	/**
	 * Returns the meta object for class '{@link br.unb.cic.c2system.Inter <em>Inter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter</em>'.
	 * @see br.unb.cic.c2system.Inter
	 * @generated
	 */
	EClass getInter();

	/**
	 * Returns the meta object for enum '{@link br.unb.cic.c2system.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see br.unb.cic.c2system.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link br.unb.cic.c2system.C2AType <em>C2A Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>C2A Type</em>'.
	 * @see br.unb.cic.c2system.C2AType
	 * @generated
	 */
	EEnum getC2AType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	C2systemFactory getC2systemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.MissionImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Completeness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__COMPLETENESS = eINSTANCE.getMission_Completeness();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__TASKS = eINSTANCE.getMission_Tasks();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.AgentImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.TeamImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__MEMBERS = eINSTANCE.getTeam_Members();

		/**
		 * The meta object literal for the '<em><b>Operates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__OPERATES = eINSTANCE.getTeam_Operates();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.TaskImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__COMPLETED = eINSTANCE.getTask_Completed();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__COST = eINSTANCE.getTask_Cost();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__XPOS = eINSTANCE.getTask_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__YPOS = eINSTANCE.getTask_YPos();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.C2ApproachImpl <em>C2 Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.C2ApproachImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getC2Approach()
		 * @generated
		 */
		EClass C2_APPROACH = eINSTANCE.getC2Approach();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C2_APPROACH__TYPE = eINSTANCE.getC2Approach_Type();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_APPROACH__ROLES = eINSTANCE.getC2Approach_Roles();

		/**
		 * The meta object literal for the '<em><b>Applies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_APPROACH__APPLIES = eINSTANCE.getC2Approach_Applies();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_APPROACH__CONNECTIONS = eINSTANCE.getC2Approach_Connections();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.EnvironmentImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Sensor Degradation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__SENSOR_DEGRADATION = eINSTANCE.getEnvironment_SensorDegradation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__DESCRIPTION = eINSTANCE.getEnvironment_Description();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.C2SystemImpl <em>C2 System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.C2SystemImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getC2System()
		 * @generated
		 */
		EClass C2_SYSTEM = eINSTANCE.getC2System();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_SYSTEM__ENTITIES = eINSTANCE.getC2System_Entities();

		/**
		 * The meta object literal for the '<em><b>Missions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_SYSTEM__MISSIONS = eINSTANCE.getC2System_Missions();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_SYSTEM__ENVIRONMENT = eINSTANCE.getC2System_Environment();

		/**
		 * The meta object literal for the '<em><b>Approaches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_SYSTEM__APPROACHES = eINSTANCE.getC2System_Approaches();

		/**
		 * The meta object literal for the '<em><b>Allocation Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2_SYSTEM__ALLOCATION_SET = eINSTANCE.getC2System_AllocationSet();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.EntityImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Roleassignment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ROLEASSIGNMENT = eINSTANCE.getEntity_Roleassignment();

		/**
		 * The meta object literal for the '<em><b>Poc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__POC = eINSTANCE.getEntity_Poc();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__LEADER = eINSTANCE.getEntity_Leader();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.RoleImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TYPE = eINSTANCE.getRole_Type();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ENTITY = eINSTANCE.getRole_Entity();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.NamedClassImpl <em>Named Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.NamedClassImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getNamedClass()
		 * @generated
		 */
		EClass NAMED_CLASS = eINSTANCE.getNamedClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CLASS__NAME = eINSTANCE.getNamedClass_Name();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.AllocableImpl <em>Allocable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.AllocableImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAllocable()
		 * @generated
		 */
		EClass ALLOCABLE = eINSTANCE.getAllocable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCABLE__ID = eINSTANCE.getAllocable_Id();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.AllocationImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__HANDLER = eINSTANCE.getAllocation_Handler();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__ASSIGNMENT = eINSTANCE.getAllocation_Assignment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION__ID = eINSTANCE.getAllocation_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION__TIMESTAMP = eINSTANCE.getAllocation_Timestamp();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.ConnectionImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SRC = eINSTANCE.getConnection_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TGT = eINSTANCE.getConnection_Tgt();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.AllocationSetImpl <em>Allocation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.AllocationSetImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getAllocationSet()
		 * @generated
		 */
		EClass ALLOCATION_SET = eINSTANCE.getAllocationSet();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_SET__ALLOCATIONS = eINSTANCE.getAllocationSet_Allocations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION_SET__NAME = eINSTANCE.getAllocationSet_Name();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.IntraImpl <em>Intra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.IntraImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getIntra()
		 * @generated
		 */
		EClass INTRA = eINSTANCE.getIntra();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.impl.InterImpl <em>Inter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.impl.InterImpl
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getInter()
		 * @generated
		 */
		EClass INTER = eINSTANCE.getInter();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.RoleType
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link br.unb.cic.c2system.C2AType <em>C2A Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unb.cic.c2system.C2AType
		 * @see br.unb.cic.c2system.impl.C2systemPackageImpl#getC2AType()
		 * @generated
		 */
		EEnum C2A_TYPE = eINSTANCE.getC2AType();

	}

} //C2systemPackage
