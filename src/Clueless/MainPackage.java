/**
 */
package Clueless;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see Clueless.MainFactory
 * @model kind="package"
 * @generated
 */
public interface MainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Clueless";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palce.clueless.edu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resource.Clueless.model.clueless.ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MainPackage eINSTANCE = Clueless.impl.MainPackageImpl.init();

	/**
	 * The meta object id for the '{@link Clueless.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Clueless.impl.PlayerImpl
	 * @see Clueless.impl.MainPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Turn Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TURN_TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PERSON_ID = 3;

	/**
	 * The feature id for the '<em><b>Card List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CARD_LIST = 4;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___MOVE = 0;

	/**
	 * The operation id for the '<em>Accuse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___ACCUSE = 1;

	/**
	 * The operation id for the '<em>Suggest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___SUGGEST = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Clueless.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Clueless.impl.RoomImpl
	 * @see Clueless.impl.MainPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trap Door Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TRAP_DOOR_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Player List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PLAYER_LIST = 2;

	/**
	 * The feature id for the '<em><b>Hallway List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HALLWAY_LIST = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Clueless.impl.HallwayImpl <em>Hallway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Clueless.impl.HallwayImpl
	 * @see Clueless.impl.MainPackageImpl#getHallway()
	 * @generated
	 */
	int HALLWAY = 2;

	/**
	 * The feature id for the '<em><b>Has Person</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__HAS_PERSON = 0;

	/**
	 * The feature id for the '<em><b>Player List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__PLAYER_LIST = 1;

	/**
	 * The feature id for the '<em><b>Adjacent Room List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__ADJACENT_ROOM_LIST = 2;

	/**
	 * The number of structural features of the '<em>Hallway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hallway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Clueless.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Clueless.impl.CardImpl
	 * @see Clueless.impl.MainPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 3;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__WEAPON = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ROOM = 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Clueless.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Clueless.impl.SolutionImpl
	 * @see Clueless.impl.MainPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Solution Card List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_CARD_LIST = 0;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Clueless.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see Clueless.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Clueless.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Player#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see Clueless.Player#getColor()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Player#getTurnToken <em>Turn Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turn Token</em>'.
	 * @see Clueless.Player#getTurnToken()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_TurnToken();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Player#getPersonId <em>Person Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Id</em>'.
	 * @see Clueless.Player#getPersonId()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PersonId();

	/**
	 * Returns the meta object for the reference list '{@link Clueless.Player#getCardList <em>Card List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Card List</em>'.
	 * @see Clueless.Player#getCardList()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_CardList();

	/**
	 * Returns the meta object for the '{@link Clueless.Player#move() <em>Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move</em>' operation.
	 * @see Clueless.Player#move()
	 * @generated
	 */
	EOperation getPlayer__Move();

	/**
	 * Returns the meta object for the '{@link Clueless.Player#accuse() <em>Accuse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accuse</em>' operation.
	 * @see Clueless.Player#accuse()
	 * @generated
	 */
	EOperation getPlayer__Accuse();

	/**
	 * Returns the meta object for the '{@link Clueless.Player#suggest() <em>Suggest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suggest</em>' operation.
	 * @see Clueless.Player#suggest()
	 * @generated
	 */
	EOperation getPlayer__Suggest();

	/**
	 * Returns the meta object for class '{@link Clueless.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Clueless.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Clueless.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the reference '{@link Clueless.Room#getTrapDoorRoom <em>Trap Door Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trap Door Room</em>'.
	 * @see Clueless.Room#getTrapDoorRoom()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_TrapDoorRoom();

	/**
	 * Returns the meta object for the reference list '{@link Clueless.Room#getPlayerList <em>Player List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Player List</em>'.
	 * @see Clueless.Room#getPlayerList()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_PlayerList();

	/**
	 * Returns the meta object for the reference list '{@link Clueless.Room#getHallwayList <em>Hallway List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hallway List</em>'.
	 * @see Clueless.Room#getHallwayList()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_HallwayList();

	/**
	 * Returns the meta object for class '{@link Clueless.Hallway <em>Hallway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hallway</em>'.
	 * @see Clueless.Hallway
	 * @generated
	 */
	EClass getHallway();

	/**
	 * Returns the meta object for the attribute list '{@link Clueless.Hallway#getHasPerson <em>Has Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Has Person</em>'.
	 * @see Clueless.Hallway#getHasPerson()
	 * @see #getHallway()
	 * @generated
	 */
	EAttribute getHallway_HasPerson();

	/**
	 * Returns the meta object for the reference list '{@link Clueless.Hallway#getPlayerList <em>Player List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Player List</em>'.
	 * @see Clueless.Hallway#getPlayerList()
	 * @see #getHallway()
	 * @generated
	 */
	EReference getHallway_PlayerList();

	/**
	 * Returns the meta object for the reference list '{@link Clueless.Hallway#getAdjacentRoomList <em>Adjacent Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adjacent Room List</em>'.
	 * @see Clueless.Hallway#getAdjacentRoomList()
	 * @see #getHallway()
	 * @generated
	 */
	EReference getHallway_AdjacentRoomList();

	/**
	 * Returns the meta object for class '{@link Clueless.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see Clueless.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Card#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weapon</em>'.
	 * @see Clueless.Card#getWeapon()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Weapon();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Card#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person</em>'.
	 * @see Clueless.Card#getPerson()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Person();

	/**
	 * Returns the meta object for the attribute '{@link Clueless.Card#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see Clueless.Card#getRoom()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Room();

	/**
	 * Returns the meta object for class '{@link Clueless.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see Clueless.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference list '{@link Clueless.Solution#getSolutionCardList <em>Solution Card List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Card List</em>'.
	 * @see Clueless.Solution#getSolutionCardList()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionCardList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MainFactory getMainFactory();

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
		 * The meta object literal for the '{@link Clueless.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Clueless.impl.PlayerImpl
		 * @see Clueless.impl.MainPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__COLOR = eINSTANCE.getPlayer_Color();

		/**
		 * The meta object literal for the '<em><b>Turn Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__TURN_TOKEN = eINSTANCE.getPlayer_TurnToken();

		/**
		 * The meta object literal for the '<em><b>Person Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PERSON_ID = eINSTANCE.getPlayer_PersonId();

		/**
		 * The meta object literal for the '<em><b>Card List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__CARD_LIST = eINSTANCE.getPlayer_CardList();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___MOVE = eINSTANCE.getPlayer__Move();

		/**
		 * The meta object literal for the '<em><b>Accuse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___ACCUSE = eINSTANCE.getPlayer__Accuse();

		/**
		 * The meta object literal for the '<em><b>Suggest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___SUGGEST = eINSTANCE.getPlayer__Suggest();

		/**
		 * The meta object literal for the '{@link Clueless.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Clueless.impl.RoomImpl
		 * @see Clueless.impl.MainPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Trap Door Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TRAP_DOOR_ROOM = eINSTANCE.getRoom_TrapDoorRoom();

		/**
		 * The meta object literal for the '<em><b>Player List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__PLAYER_LIST = eINSTANCE.getRoom_PlayerList();

		/**
		 * The meta object literal for the '<em><b>Hallway List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HALLWAY_LIST = eINSTANCE.getRoom_HallwayList();

		/**
		 * The meta object literal for the '{@link Clueless.impl.HallwayImpl <em>Hallway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Clueless.impl.HallwayImpl
		 * @see Clueless.impl.MainPackageImpl#getHallway()
		 * @generated
		 */
		EClass HALLWAY = eINSTANCE.getHallway();

		/**
		 * The meta object literal for the '<em><b>Has Person</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALLWAY__HAS_PERSON = eINSTANCE.getHallway_HasPerson();

		/**
		 * The meta object literal for the '<em><b>Player List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HALLWAY__PLAYER_LIST = eINSTANCE.getHallway_PlayerList();

		/**
		 * The meta object literal for the '<em><b>Adjacent Room List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HALLWAY__ADJACENT_ROOM_LIST = eINSTANCE.getHallway_AdjacentRoomList();

		/**
		 * The meta object literal for the '{@link Clueless.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Clueless.impl.CardImpl
		 * @see Clueless.impl.MainPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Weapon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__WEAPON = eINSTANCE.getCard_Weapon();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__PERSON = eINSTANCE.getCard_Person();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ROOM = eINSTANCE.getCard_Room();

		/**
		 * The meta object literal for the '{@link Clueless.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Clueless.impl.SolutionImpl
		 * @see Clueless.impl.MainPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Solution Card List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_CARD_LIST = eINSTANCE.getSolution_SolutionCardList();

	}

} //MainPackage
