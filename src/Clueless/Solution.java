/**
 */
package Clueless;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Clueless.Solution#getSolutionCardList <em>Solution Card List</em>}</li>
 * </ul>
 *
 * @see Clueless.MainPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {
	/**
	 * Returns the value of the '<em><b>Solution Card List</b></em>' reference list.
	 * The list contents are of type {@link Clueless.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Card List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Card List</em>' reference list.
	 * @see Clueless.MainPackage#getSolution_SolutionCardList()
	 * @model upper="3"
	 * @generated
	 */
	EList<Card> getSolutionCardList();

} // Solution
