/**
 */
package Clueless;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Clueless.Room#getName <em>Name</em>}</li>
 *   <li>{@link Clueless.Room#getTrapDoorRoom <em>Trap Door Room</em>}</li>
 *   <li>{@link Clueless.Room#getPlayerList <em>Player List</em>}</li>
 *   <li>{@link Clueless.Room#getHallwayList <em>Hallway List</em>}</li>
 * </ul>
 *
 * @see Clueless.MainPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Clueless.MainPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Clueless.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trap Door Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trap Door Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trap Door Room</em>' reference.
	 * @see #setTrapDoorRoom(Room)
	 * @see Clueless.MainPackage#getRoom_TrapDoorRoom()
	 * @model
	 * @generated
	 */
	Room getTrapDoorRoom();

	/**
	 * Sets the value of the '{@link Clueless.Room#getTrapDoorRoom <em>Trap Door Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trap Door Room</em>' reference.
	 * @see #getTrapDoorRoom()
	 * @generated
	 */
	void setTrapDoorRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Player List</b></em>' reference list.
	 * The list contents are of type {@link Clueless.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player List</em>' reference list.
	 * @see Clueless.MainPackage#getRoom_PlayerList()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayerList();

	/**
	 * Returns the value of the '<em><b>Hallway List</b></em>' reference list.
	 * The list contents are of type {@link Clueless.Hallway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hallway List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hallway List</em>' reference list.
	 * @see Clueless.MainPackage#getRoom_HallwayList()
	 * @model
	 * @generated
	 */
	EList<Hallway> getHallwayList();

} // Room
