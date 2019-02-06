/**
 */
package Clueless;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Clueless.Player#getName <em>Name</em>}</li>
 *   <li>{@link Clueless.Player#getColor <em>Color</em>}</li>
 *   <li>{@link Clueless.Player#getTurnToken <em>Turn Token</em>}</li>
 *   <li>{@link Clueless.Player#getPersonId <em>Person Id</em>}</li>
 *   <li>{@link Clueless.Player#getCardList <em>Card List</em>}</li>
 * </ul>
 *
 * @see Clueless.MainPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
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
	 * @see Clueless.MainPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Clueless.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see Clueless.MainPackage#getPlayer_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link Clueless.Player#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Turn Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Token</em>' attribute.
	 * @see #setTurnToken(Boolean)
	 * @see Clueless.MainPackage#getPlayer_TurnToken()
	 * @model
	 * @generated
	 */
	Boolean getTurnToken();

	/**
	 * Sets the value of the '{@link Clueless.Player#getTurnToken <em>Turn Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Token</em>' attribute.
	 * @see #getTurnToken()
	 * @generated
	 */
	void setTurnToken(Boolean value);

	/**
	 * Returns the value of the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Id</em>' attribute.
	 * @see #setPersonId(String)
	 * @see Clueless.MainPackage#getPlayer_PersonId()
	 * @model
	 * @generated
	 */
	String getPersonId();

	/**
	 * Sets the value of the '{@link Clueless.Player#getPersonId <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Id</em>' attribute.
	 * @see #getPersonId()
	 * @generated
	 */
	void setPersonId(String value);

	/**
	 * Returns the value of the '<em><b>Card List</b></em>' reference list.
	 * The list contents are of type {@link Clueless.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card List</em>' reference list.
	 * @see Clueless.MainPackage#getPlayer_CardList()
	 * @model
	 * @generated
	 */
	EList<Card> getCardList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accuse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void suggest();

} // Player
