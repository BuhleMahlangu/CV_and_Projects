using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace grp3PROJECT
{
    public partial class SupplierLogin : Form
    {
        SqlConnection conn;
        private const string connstr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\grp3PROJECT\Spaza_DB.mdf;Integrated Security=True";
        SqlCommand cmd;
        SqlDataAdapter adapt;
        DataSet ds;

        public SupplierLogin()
        {
            InitializeComponent();
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            string supplierID = txtSupplier.Text;
            string contact = txtContact.Text;
            string email = txtEmail.Text;
            string name = txtName.Text;

            if (VerifyLogin(supplierID, contact, email, name))
            {
                MessageBox.Show("Login successful!");
                DialogResult = DialogResult.OK;


            }
            else
            {
                MessageBox.Show("Invalid ownerID, contact, or email");
            }
        }

        private bool VerifyLogin(string ownerID, string contact, string email, string name)
        {
            bool isValid = false;

            using (SqlConnection conn = new SqlConnection(connstr))
            {
                conn.Open();

                string query = "SELECT COUNT(*) FROM Supplier WHERE supplierID LIKE @supplierID AND contact LIKE @contact AND email LIKE @email AND name LIKE @name";
                cmd = new SqlCommand(query, conn);
                cmd.Parameters.AddWithValue("@ownerID", ownerID);
                cmd.Parameters.AddWithValue("@contact", contact);
                cmd.Parameters.AddWithValue("@email", email);
                cmd.Parameters.AddWithValue("@name", name);

                using (SqlDataReader read = cmd.ExecuteReader())
                {
                    if (read.Read())
                    {
                        int count = read.GetInt32(0);

                        if (count > 0)
                        {
                            isValid = true;
                        }
                    }
                }
            }
            return isValid;
        }
    }
}
