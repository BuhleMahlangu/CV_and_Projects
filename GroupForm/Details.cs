using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace grp3PROJECT
{
    public partial class Details : Form
    {
        public Details()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {

            //Open the update form
            UpdateForm update = new UpdateForm();
            update.Show();
            this.Hide();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Order form
            Order newOrder = new Order();
            newOrder.Show();
            this.Hide();
        }
    }
}
